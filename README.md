## SpaceX project


#### Description
This app simulates space travel and calculates time you need to achieve some Planet.
Calculations were made with formulas provided on this
 [site](http://nathangeffen.webfactional.com/spacetravel/spacetravel.php).

At first, you create spaceship with 3 essential parts:
- cabin (predefined types: comfort, VIP, delux, cosy, economy);
- engine (from 3 to 5 instances) (predefined types: slow, economy, superFast, fast, old);
- fuel tank (for each engine) (predefined types: small, medium, large, huge. titanic).

All calculations for receiving time of journey (for observers) and 
fuel needs were made by using `BigDecimal`.

_On [site](https://phys.org/news/2016-02-nasa-mars-days.html) says
that it's possible to reach Mars in 3 days_, and calculations in our app
near that. 

If you have enough fuel, you receive additional info about your trip.
At the end you will be offered to try again.


#### How to start up ?
- git clone
- compile App.java by ```javac src/App.java```
##### after that you can start app in 2 ways:
1# start app with ```java src/App```

2# make a jar file in 2 steps and start:
         
         echo "Main-Class: src/App"> manifest.mf
         jar cmf manifest.mf App.jar src/*
         java -jar App.jar



##### Additional resources:
- [Space travel calculator](http://nathangeffen.webfactional.com/spacetravel/spacetravel.php)
and its [git repository](https://github.com/nathangeffen/space-travel)
- [Planet distance table](https://theplanets.org/distances-between-planets/)