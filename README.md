# Pokemon TCG

En esta instacia se nos pide emular el juego de cartas de 
Pokemon de una manera superficial, solo ideando lo que seria el esqueleto del juego.

## Implementacion

Este codigo consta de la clase Entrenador que representa al jugador, y luego tenemos la clase madre Carta
la cual se desprende en Pokemon y Energia que son los dos tipos de cartas que debemos implementar, asimismo, 
los pokemones se subdividen en sus tipos que son los que definen sus fortalezas y debilidades. 
### Desarrollo

Para llevar a cabo la tarea fueron necesarias varias implementaciones de
double dispatch para reconocer tipos de ataques, pokemones o energias, como por ejemplo
```
Entrenador.jugarCarta();// el entrenador envia un mensaje a la carta que va a ser jugada
Carta.serJugada();// la carta responde al mensaje y se define como energia o pokemon
Entrenador.jugarEnergia() o Entrenador.jugarPkmn();

```

#



## Autor

* **Juan Rodriguez Cruz** - [Github](https://github.com/JuanRodriguezCruz)



