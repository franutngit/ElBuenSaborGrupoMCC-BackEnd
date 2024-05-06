package com.buenSabor.back.business.services.impl;

import com.buenSabor.back.business.services.IFacturaService;
import com.buenSabor.back.domain.entities.Factura;
import org.springframework.stereotype.Service;

@Service
public class FacturaServiceImpl extends BaseServiceImpl<Factura,Long> implements IFacturaService {
}
