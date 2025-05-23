# ECI-SaludVital-parcial03 (Backend)

## Descripción

ECI salud vital es un programa dirigido pra gestionar citas medicas segun especialidad y donde los usuarios ademas de poder agendar sus citas medicas podran visualizar sus citas previas siguiendo un historial.
En este repostitorio se veran las partes del backend de ECI salud vital.
## Creacion de proyecto en Springboot
![image](https://github.com/user-attachments/assets/169ab1df-d915-4a7e-b61b-c3472a427331)

-- Características Principales--

## Gestión de citas
-Segun los datos del paciente se crea una cita para realizar un registro y eventualmente estara en el historial de este.

![image](https://github.com/user-attachments/assets/22261c08-f3fb-4afb-837a-04a23b1b4916)

## Gestión de especialidades

-Se abre el campo donde a partir de las especialidades existentes el usuario puede registrar su cita, esto segun los datos de la especialidad.

![image](https://github.com/user-attachments/assets/ecf68fba-b650-403a-a272-400828f0da37)


## Para Funcionarios de SaludVital

-- Gestión personal limitada:

Visualizar su historial de los pacientes
Asignar sus horarios de disponibilidad 
Gestionar citas creadas.


-- Visualización de información:

Consultar horarios por espacio (solo lectura)
Consultar horarios por responsable (solo lectura)

## Diagramas



## Diagramas
      - En astah
- Diagrama de clases
´´
![image](https://github.com/user-attachments/assets/0f2d4172-e87b-4381-b342-2f5fd92ee0a5)

´´
- Diagrama de componentes
´´

´´


## Flujos de Trabajo Principales
-- Registro de cita

Usuario accede a la opción "Registrar cita"
Selecciona tipo de especialidades.
Completa todos los campos requeridos según el tipo


-- Configuración de Horarios

Administrador o Funcionario accede a "Gestión de Horarios"
Selecciona el espacio o servicio a configurar
Define día de la semana y franjas horarias disponibles


## Tecnologías Utilizadas

  ´´
Frontend: HTML, CSS, JavaScript, React
Backend: Java, Spring Boot
Base de Datos: MongoDB

  ´´

## Instalación y Configuración

Clonar el repositorio
bashgit clone (repositorio)
cd repositorio

Instalamos las dependencias
bashmvn install





© 2025 Sistema de ECI salud vital - Desarrollado por Juan Mejía
