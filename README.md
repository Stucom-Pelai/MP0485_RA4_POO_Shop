## About Shop application
> Using this small program to explain about the OOP.

> To run the program, please read the follow:
#### Requirements
* Java 1.17

#### Features
1. Show cash
2. Add product
3. Add stock
4. Set product as expired
5. Show inventory
6. Sale products
7. Show sales

#### Installation
```
git clone https://github.com/Stucom-Pelai/MP0485_RA4_POO_Shop
```

#### Run 
```
run file main.Shop.java
```

#### Class Diagram
```mermaid
classDiagram
    direction LR
    class Shop{
      -Amount cash
      -ArrayList~Product~ inventory  
      -ArrayList~Sale~ sales 
      +main() void
      +loadInventory() void
      +showCash() void
      +addProduct() void
      +addStock() void
      +setExpired() void
      +showInventory() void
      +sale() void
      +showSales() void
      +addProduct(Product product) void
      +isInventoryFull() boolean
      +findProduct(String name) Product
    }

    class Product{
      -int id
      -String name
      -Amount publicPrice
      -Amount wholesalerPrice
      -boolean available
      -int stock
      -int totalProducts$
      +expire() void
    }

    class Sale{
      -String client
      -ArrayList~Product~ products  
      -Amount amount
    }

    class Amount{
      -double value
      -String currency
    }

    %% Relaciones
    Shop *-- "0..10" Product : inventory
    Shop o-- "0..10" Sale : sales
    Shop *-- "1" Amount : cash

    Sale *-- "1..10" Product : products
    Sale *-- "1" Amount : total

    Product --> "1" Amount : publicPrice
    Product --> "1" Amount : wholesalerPrice
```

