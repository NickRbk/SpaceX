## SpaceX project


#### Description
This app simulate space travel and calculate time you need to achieve some Planet.
Calculations were made with formulas provided on this [site](http://nathangeffen.webfactional.com/spacetravel/spacetravel.php).

At first, you create spaceship with 3 essential parts:
- cabin (predefined types: comfort, VIP, delux, cosy, economy);
- engine (from 3 to 5 instances) (predefined types: slow, economy, superFast, fast, old);
- fuel tank (for each engine) (predefined types: small, medium, large, huge. titanic).

All calculations for receiving time of journey (for observers) and fuel needs were made
by using `BigDecimal`.

If you have enough fuel, you receive additional info about your trip.
At the end you will be offered to try again.


#### How to start up ?
- git clone
- compile App.java by ```javac App.java```
- start app with ```java App```


##### Additional resources:
- [Space travel calculator](http://nathangeffen.webfactional.com/spacetravel/spacetravel.php)
and its [git repository](https://github.com/nathangeffen/space-travel)
- [Planet distance table](https://theplanets.org/distances-between-planets/)