package com.poc.soap;




import br.pucminas.*;
import lombok.RequiredArgsConstructor;

import org.springframework.ws.server.endpoint.annotation.Endpoint;
import org.springframework.ws.server.endpoint.annotation.PayloadRoot;
import org.springframework.ws.server.endpoint.annotation.RequestPayload;
import org.springframework.ws.server.endpoint.annotation.ResponsePayload;


@Endpoint
@RequiredArgsConstructor
public class CalculatorEndpoint {
    private static final String NAMESPACE_URI = "http://www.pucminas.br";

    private final CalculatorService calculatorService;



    @PayloadRoot(namespace = NAMESPACE_URI, localPart = "sumRequest")
    @ResponsePayload
    public SumResponse sum(@RequestPayload SumRequest request) throws Exception {
        SumResponse response = new SumResponse();
        response.setSumResult(calculatorService.calc(request.getNum1(), request.getNum2(),OperatorEnum.SUM));
        return response;
    }
    @PayloadRoot(namespace = NAMESPACE_URI, localPart = "subtractRequest")
    @ResponsePayload
    public SubtractResponse subtract(@RequestPayload SubtractRequest request) throws Exception {
        SubtractResponse response = new SubtractResponse();
        response.setSubtractResult(calculatorService.calc(request.getNum1(), request.getNum2(),OperatorEnum.SUBTRACT));
        return response;
    }
    @PayloadRoot(namespace = NAMESPACE_URI, localPart = "multiplyRequest")
    @ResponsePayload
    public MultiplyResponse multiply(@RequestPayload MultiplyRequest request) throws Exception {
        MultiplyResponse response = new MultiplyResponse();
        response.setMultiplyResult(calculatorService.calc(request.getNum1(), request.getNum2(),OperatorEnum.MULTIPLY));
        return response;
    }
    @PayloadRoot(namespace = NAMESPACE_URI, localPart = "divideRequest")
    @ResponsePayload
    public DivideResponse divide(@RequestPayload DivideRequest request) throws Exception {
        DivideResponse response = new DivideResponse();
        response.setDivideResult(calculatorService.calc(request.getNum1(), request.getNum2(),OperatorEnum.DIVIDE));
        return response;
    }
}