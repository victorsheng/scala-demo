//package lesson1.classdef
//
//
//
//trait flying {
//  def fly() = println("flying")
//}
//
//trait gliding {
//  def gliding() = println("gliding")
//}
//
//
//class Vehicle(speed: Int) {
//  val mph: Int = speed
//
//  def race() = println("Racing")
//}
//
//class Car(speed: Int) extends Vehicle(speed) {
//  override val mph: Int = speed
//
//  override def race() = println("Racing Car")
//
//}
//
//class Bike(speed: Int) extends Vehicle(speed) {
//  override val mph: Int = speed
//
//  override def race() = println("Racing Bike")
//}
//
//class AirCraft(speed: Int) extends Vehicle(speed) with flying with gliding {
//  override val mph: Int = speed
//
//  override def race() = println("Racing")
//
//  override def fly() = println("Flying")
//
//  override def gliding() = println("Gliding")
//}
//
//
//object TraitDef {
//
//  def main(args: Array[String]): Unit = {
//    val vehicle1 = new Car(200)
//    val vehicle2 = new Bike(100)
//
//    val vehicle3 = new AirCraft(300)
//    vehicle3.fly()
//    val vehicleList = List(vehicle1, vehicle2, vehicle3)
//    println(vehicleList);
//    val fastestVehicle = vehicleList.maxBy(_.mph)
//    println(fastestVehicle);
//  }
//
//}