# Intent

Abstract Factory is a creational design pattern that lets you produce families of related objects without specifying their concrete classes.
![](abstract-factory.png)

# Problem

Imagine that you’re creating a furniture shop simulator. Your code consists of classes that represent:
* A family of related products, say: Chair + Sofa + CoffeeTable.
* Several variants of this family. For example, products Chair + Sofa + CoffeeTable are available in these variants: Modern, Victorian, ArtDeco.
![](problem.png)
You need a way to create individual furniture objects so that they match other objects of the same family. Customers get quite mad when they receive non-matching furniture.
![](abstract-factory-comic.png)
Also, you don’t want to change existing code when adding new products or families of products to the program. Furniture vendors update their catalogs very often, and you wouldn’t want to change the core code each time it happens.

# Diagram

![](umlDiagram.png)