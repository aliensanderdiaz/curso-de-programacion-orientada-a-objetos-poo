from car import Car

if __name__ == "__main__":
    print("Hola mundo")

    car = Car()
    car.license = "ABC123"
    car.driver = "Andres Herrera"
    car.passengers = 5

    # print("License: " + car.license)
    print(vars(car))
    