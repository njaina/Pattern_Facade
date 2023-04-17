package com.example.FacadeTraining;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class ConcreteClass1 extends AbstractClass1{
    private ConcreteDependance1 dependance1;
    private ConcreteDependace2 dependace2;

}
