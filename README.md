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
      expire() void
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
```

