package com.buenSabor.back;

import com.buenSabor.back.domain.entities.*;
import com.buenSabor.back.domain.entities.enums.Estado;
import com.buenSabor.back.domain.entities.enums.FormaPago;
import com.buenSabor.back.domain.entities.enums.TipoEnvio;
import com.buenSabor.back.domain.entities.enums.TipoPromocion;
import com.buenSabor.back.repositories.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.time.LocalDate;
import java.time.LocalTime;

@SpringBootApplication
public class BackApplication {

	private static final Logger logger = LoggerFactory.getLogger(BackApplication.class);

	@Autowired
	private ClienteRepository clienteRepository;

	@Autowired
	private PaisRepository paisRepository;

	@Autowired
	private ProvinciaRepository provinciaRepository;

	@Autowired
	private LocalidadRepository localidadRepository;

	@Autowired
	private EmpresaRepository empresaRepository;

	@Autowired
	private SucursalRepository	sucursalRepository;

	@Autowired
	private DomicilioRepository domicilioRepository;

	@Autowired
	private UnidadMedidaRepository unidadMedidaRepository;

	@Autowired
	private CategoriaRepository categoriaRepository;

	@Autowired
	private ArticuloInsumoRepository articuloInsumoRepository;

	@Autowired
	private ArticuloManufacturadoRepository articuloManufacturadoRepository;

	@Autowired
	private ImagenRepository imagenRepository;

	@Autowired
	private PromocionRepository promocionRepository;

	@Autowired
	private PedidoRepository pedidoRepository;

	@Autowired
	private UsuarioRepository usuarioRepository;

	@Autowired
	private FacturaRepository facturaRepository;

	@Autowired
	private DetallePedidoRepository detallePedidoRepository;

	public static void main(String[] args) {
		SpringApplication.run(BackApplication.class, args);
	}

	@Bean
	CommandLineRunner init(){
		return args -> {
			//Crear Empresa
			Empresa empresa = Empresa.builder()
					.cuil(2012345678)
					.razonSocial("Empresa A")
					.nombre("Program SA")
					.build();
			empresaRepository.save(empresa);

			//Crear Pais
			Pais pais1 = Pais.builder()
					.nombre("Argentina")
					.build();
			paisRepository.save(pais1);

			//Crear Provincia
			Provincia provincia1 = Provincia.builder()
					.nombre("Mendoza")
					.pais(pais1)
					.build();
			provinciaRepository.save(provincia1);

			//Crear Localidad 1
			Localidad localidad1 = Localidad.builder()
					.nombre("Lujan de Cuyo")
					.provincia(provincia1)
					.build();
			localidadRepository.save(localidad1);

			//Crear Localidad 2
			Localidad localidad2 = Localidad.builder()
					.nombre("Godoy Cruz")
					.provincia(provincia1)
					.build();
			localidadRepository.save(localidad2);

			//Crear Domicilio Sucursal 1
			Domicilio domicilio1 = Domicilio.builder()
					.calle("San Martin")
					.numero(456)
					.cp(5512)
					.localidad(localidad1)
					.build();

			//Crear Domicilio Sucursal 2
			Domicilio domicilio2 = Domicilio.builder()
					.calle("Pescara")
					.numero(123)
					.cp(5512)
					.localidad(localidad2)
					.build();

			//Crear Sucursal 1
			Sucursal sucursal1 = Sucursal.builder()
					.nombre("Sucursal 1")
					.horarioApertura(LocalTime.of(17,0))
					.horarioCierre(LocalTime.of(23,0))
					.empresa(empresa)
					.build();
			sucursalRepository.save(sucursal1);

			//Crear Sucursal 2
			Sucursal sucursal2 = Sucursal.builder()
					.nombre("Sucursal 2")
					.horarioApertura(LocalTime.of(17,0))
					.horarioCierre(LocalTime.of(23,0))
					.empresa(empresa)
					.domicilio(domicilio2)
					.build();
			sucursalRepository.save(sucursal2);

			//Guardar Domicilios de Sucursal
			domicilio1.setSucursal(sucursal1);
			domicilio2.setSucursal(sucursal2);
			domicilioRepository.save(domicilio1);
			domicilioRepository.save(domicilio2);

			//Crear categoria 1
			Categoria categoria = Categoria.builder()
					.denominacion("Bebidas")
					.build();

			//Crear subcategoria para categoria 1
			Categoria subcategoria = Categoria.builder()
					.denominacion("Tragos")
					.build();

			//Crear Unidad de Medida
			UnidadMedida unidadMedidaLitros = UnidadMedida.builder()
					.denominacion("Litros")
					.build();
			unidadMedidaRepository.save(unidadMedidaLitros);

			//Crear ArticuloInsumo 1
			ArticuloInsumo articuloInsumo1 = ArticuloInsumo.builder()
					.denominacion("Coca Cola")
					.precioVenta(1000.)
					.unidadMedida(unidadMedidaLitros)
					.precioCompra(700.)
					.stockActual(15)
					.stockMaximo(60)
					.esParaElaborar(false)
					.build();

			//Crear ArticuloInsumo 2
			ArticuloInsumo articuloInsumo2 = ArticuloInsumo.builder()
					.denominacion("Ron")
					.precioVenta(5000.)
					.unidadMedida(unidadMedidaLitros)
					.precioCompra(2000.)
					.stockActual(8)
					.stockMaximo(15)
					.esParaElaborar(false)
					.build();

			//Guardar Categoria
			categoria.getSucursales().add(sucursal1);
			categoria.getSucursales().add(sucursal2);;
			categoria.getSubCategorias().add(subcategoria);
			categoriaRepository.save(categoria);

			//Guardar Articulos
			articuloInsumo1.setCategoria(categoria);
			articuloInsumo2.setCategoria(subcategoria);
			articuloInsumoRepository.save(articuloInsumo1);
			articuloInsumoRepository.save(articuloInsumo2);

			//Crear Imagenes
			Imagen imagenCoca = Imagen.builder()
					.url("https://m.media-amazon.com/images/I/51v8nyxSOYL._SL1500_.jpg")
					.articulo(articuloInsumo1)
					.build();

			Imagen imagenCampari = Imagen.builder()
					.url("https://mandolina.co/wp-content/uploads/2023/03/648366622-1024x683.jpg")
					.articulo(articuloInsumo2)
					.build();

			//Guardar Imagenes de Articulos
			imagenRepository.save(imagenCoca);
			imagenRepository.save(imagenCampari);

			//Crear Usuario
			Usuario usuario = Usuario.builder()
					.auth0Id("2asf2sadf54as5d6f")
					.username("user123")
					.build();
			usuarioRepository.save(usuario);

			//Crear Cliente
			Cliente cliente = Cliente.builder()
					.nombre("Julian")
					.apellido("Alvarez")
					.telefono("123456798")
					.email("ja@gmail.com")
					.usuario(usuario)
					.build();
			clienteRepository.save(cliente);

			//Crear Domicilio Cliente
			Domicilio domicilio3 = Domicilio.builder()
					.calle("Barcala")
					.numero(254)
					.cp(5515)
					.localidad(localidad2)
					.build();
			domicilio3.getClientes().add(cliente);
			domicilioRepository.save(domicilio3);

			//Crear Imagene para cliente
			Imagen imagenCliente = Imagen.builder()
					.url("https://hips.hearstapps.com/hmg-prod/images/la-la-land-final-1638446140.jpg")
					.cliente(cliente)
					.build();
			imagenRepository.save(imagenCliente);

			//Crear Promocion
			Promocion promocion = Promocion.builder()
					.denominacion("Dia de los Enamorados")
					.fechaDesde(LocalDate.of(2024,2,13))
					.fechaHasta(LocalDate.of(2024,2,15))
					.horaDesde(LocalTime.of(0,0))
					.horaHasta(LocalTime.of(23,59))
					.descripcionDescuento("El descuento que se hace por san valentin, un dia antes y un dia despues")
					.precioPromocional(100.0)
					.tipoPromocion(TipoPromocion.promocion)
					.build();
			promocion.getArticulos().add(articuloInsumo2);
			promocion.getSucursales().add(sucursal1);
			promocion.getSucursales().add(sucursal2);
			promocionRepository.save(promocion);

			//Crear Imagen Promocion
			Imagen imagenPromocion = Imagen.builder()
					.url("https://superdepaso.com.ar/wp-content/uploads/2021/06/SANTAROSA-PATEGRAS-04.jpg")
					.promocion(promocion)
					.build();
			imagenRepository.save(imagenPromocion);

			//Crear Pedido
			Pedido pedido = Pedido.builder()
					.fechaPedido(LocalDate.now())
					.horaEstimadaFinalizacion(LocalTime.now())
					.total(5000.)
					.totalCosto(2000.)
					.estado(Estado.Preparacion)
					.formaPago(FormaPago.MercadoPago)
					.tipoEnvio(TipoEnvio.Delivery)
					.sucursal(sucursal1)
					.domicilio(domicilio3)
					.cliente(cliente)
					.build();
			pedidoRepository.save(pedido);

			//Crear DetallePedido
			DetallePedido detallePedido = DetallePedido.builder()
					.cantidad(1)
					.subTotal(5000.)
					.articulo(articuloInsumo2)
					.pedido(pedido)
					.build();
			detallePedidoRepository.save(detallePedido);

			//Crear Factura
			Factura factura = Factura.builder()
					.fechaFacturacion(LocalDate.now())
					.mpPaymentId(1)
					.mpPaymentType("asd")
					.mpPreferenceId("qwe")
					.mpMerchantOrderId(1)
					.totalVenta(132.)
					.formaPago(FormaPago.MercadoPago)
					.pedido(pedido)
					.build();
			facturaRepository.save(factura);
		};
	}
}