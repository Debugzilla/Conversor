
import javax.swing.*;
public class Conversores {



    public static void iniciarConversorTemp(){
        try{
            // Solicitar la temperatura en grados Celsius
            String tempStr = JOptionPane.showInputDialog(null, "Ingresa la temperatura en grados Celsius:", "Conversión de Temperatura", JOptionPane.QUESTION_MESSAGE);

            if(tempStr == null){
                return; //si el usuario cancela, salir del metodo
            }

            //Convertir el valor ingresado a un valor numerico
            double tempCelsius = Double.parseDouble(tempStr);

            // Convertir de Celsius a Fahrenheit
            double tempFahrenheit = (tempCelsius * 9 / 5) + 32;

            // Mostrar el resultado
            JOptionPane.showMessageDialog(null, "La temperatura en Fahrenheit es: " + tempFahrenheit, "Resultado", JOptionPane.INFORMATION_MESSAGE);


        }catch (NumberFormatException e){
            JOptionPane.showMessageDialog(null, "Por favor, ingresa un valor válido.", "Error", JOptionPane.ERROR_MESSAGE);
        }

        }

    public static void iniciarConversorMoneda(){
        try{
            String montoStr = JOptionPane.showInputDialog(null, "Monto a convertir:", "Conversión de Moneda", JOptionPane.QUESTION_MESSAGE);
            if(montoStr == null){
                return; //si el usuario cancela, salir del metodo
            }
            double monto = Double.parseDouble(montoStr);

            //Solicitar moneda de origen
            String monedaOrigen = JOptionPane.showInputDialog(null, "Moneda de origen(USD,EUR):", "Conversión de Moneda", JOptionPane.QUESTION_MESSAGE);
            if(monedaOrigen == null){
                return;
            }

            //Solicitar moneda de origen
            String monedaDestino = JOptionPane.showInputDialog(null, "Moneda de destino(USD,EUR):", "Conversión de Moneda", JOptionPane.QUESTION_MESSAGE);
            if(monedaDestino == null){
                return;
            }

            if(monedaOrigen.equals("USD")  && monedaDestino.equals("EUR")) {
                // Realizar la conversión (esto es un ejemplo, debes implementar la lógica real)
                double tasaCambio = 0.95; // Ejemplo: supongamos que la tasa es 0.85
                double resultado = monto * tasaCambio;
                // Mostrar el resultado
                JOptionPane.showMessageDialog(null,  + monto +"" + monedaOrigen + " son " + resultado + "" + monedaDestino + " con la tasa de cambio actual");

            }
            if(monedaOrigen.equals("EUR") && monedaDestino.equals("USD")){
                double tasaCambio = 1.05;
                double resultado = monto * tasaCambio;
                JOptionPane.showMessageDialog(null,  + monto +"" + monedaOrigen + " son " + resultado + "" + monedaDestino + " con la tasa de cambio actual");

            }

        }catch (NumberFormatException e){
            JOptionPane.showMessageDialog(null, "Por favor, ingresa un monto válido.", "Error", JOptionPane.ERROR_MESSAGE);
        }










    }



    //Función convertirMoneda(monto, monedaOrigen, monedaDestino)
    //Obtener tasaDeCambio de monedaOrigen a monedaDestino
    //Si hay API disponible entonces
    //Llamar a API para obtener tasa de cambio actualizada
    //Si no hay API entonces
    //Usar tasas de cambio predefinidas (valores fijos)
    //resultado = monto * tasaDeCambio
    //Retornar resultado
    //Fin Función











}
