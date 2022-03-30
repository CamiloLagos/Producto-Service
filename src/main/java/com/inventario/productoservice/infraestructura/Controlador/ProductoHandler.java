package com.inventario.productoservice.infraestructura.Controlador;

import com.amazonaws.services.lambda.runtime.Context;
import com.amazonaws.services.lambda.runtime.RequestHandler;

public class ProductoHandler implements RequestHandler<String, Object> {
    @Override
    public String handleRequest(String input, Context context) {
        return "Funcionando";
    }
}
