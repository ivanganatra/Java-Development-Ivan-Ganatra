package com.company;
interface Shape{
    boolean askInputs();
    default double calcArea() throws Exception { throw  new Exception("calcArea function should be called for 2D figures only.");}
    default double calcPerimeter() throws Exception { throw  new Exception("calcArea function should be called for 2D figures only.");}
    default double calcSurfaceArea() throws Exception { throw  new Exception("calcArea function should be called for 3D figures only.");}
    default double calcVolume() throws Exception { throw  new Exception("calcArea function should be called for 3D figures only.");}
}
