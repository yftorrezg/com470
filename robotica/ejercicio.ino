/* 
  Si el sensor ultrasonico mide una distancia menor a 22 cm:
    Motor se mueve hacia adelante con una velocidad de 150

  Si el sensor ultrasonico mide una distancia mayor o igual a 22 cm pero menor a 30cm:
    Un led tiene que parpadear cada segundo, un led de alerta cada 1 segundo

  Si el sensor ultrasonico mide una distancia mayor o igual a 30 cm:
    Motor se mueve hacia atras con una velocidad de 150 
*/

#include <AFMotor.h>

AF_DCMotor motor1(1, MOTOR12_1KHZ);
AF_DCMotor motor2(2, MOTOR12_1KHZ);

int trigPin = 2;
int echoPin = 3;
long duration;
int distance;

void setup() {
  Serial.begin(9600);
  pinMode(trigPin, OUTPUT);
  pinMode(echoPin, INPUT);
  motor1.setSpeed(150);
  motor2.setSpeed(150);
}

void loop() {
  digitalWrite(trigPin, LOW);
  delayMicroseconds(2);
  digitalWrite(trigPin, HIGH);
  delayMicroseconds(10);
  digitalWrite(trigPin, LOW);
  duration = pulseIn(echoPin, HIGH);
  distance = duration*0.034/2;
  Serial.print("Distance: ");
  Serial.println(distance);
  if (distance < 22) {
    motor1.run(FORWARD);
    motor2.run(FORWARD);
  } else if (distance >= 22 && distance < 30) {
    motor1.run(RELEASE);
    motor2.run(RELEASE);
  } else {
    motor1.run(BACKWARD);
    motor2.run(BACKWARD);
  }
}

// Path: robotica\ejercicio.ino