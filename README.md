![](./images/logos_feder.png)



| Entregable     | Importador base                                              |
| -------------- | ------------------------------------------------------------ |
| Fecha          | 17/12/2020                                                   |
| Proyecto       | [ASIO](https://www.um.es/web/hercules/proyectos/asio) (Arquitectura Semántica e Infraestructura Ontológica) en el marco de la iniciativa [Hércules](https://www.um.es/web/hercules/) para la Semántica de Datos de Investigación de Universidades que forma parte de [CRUE-TIC](http://www.crue.org/SitePages/ProyectoHercules.aspx) |
| Módulo         | Abstracciones de ASIO                                        |
| Tipo           | Software                                                     |
| Objetivo       | Definición de clases y constantes comunes a compartir entre todos los proyectos ASIO. |
| Estado         | **80%** Es una clase con código común que irá adaptándose a futuros cambios |
| Próximos pasos | Modificarlo con las actualizaciones necesarias al ir desarrollando. |
| Documentación  | [Manual de usuario](https://github.com/HerculesCRUE/ib-asio-docs-/blob/master/00-An%C3%A1lisis/Manual%20de%20usuario/Manual%20de%20usuario.md)<br />[Manual de despliegue](https://github.com/HerculesCRUE/ib-asio-composeset/blob/master/README.md)<br />[Documentación técnica](https://github.com/HerculesCRUE/ib-asio-docs-/blob/master/00-Arquitectura/arquitectura_semantica/documento_arquitectura/ASIO_Izertis_Arquitectura.md) |

# ASIO - Abstractions

|              | Master                                                       |
| ------------ | ------------------------------------------------------------ |
| Quality Gate | [![Quality Gate Status](https://sonarcloud.io/api/project_badges/measure?project=HerculesCRUE_ib-asio-abstractions&metric=alert_status)](https://sonarcloud.io/dashboard?id=HerculesCRUE_ib-asio-abstractions) |

Definición de clases y constantes comunes a compartir entre todos los proyectos ASIO

## OnBoarding

Para iniciar el entorno de desarrollo se necesita cumplir los siguientes requisitos:

* OpenJDK 11 (en caso de querer JDK8: Oracle JDK 8)
* Eclipse JEE 2019-09 con plugins:
  * Spring Tools 4
  * m2e-apt
  * Lombok
* Docker

## Metodología de desarrollo

La metodología de desarrollo es Git Flow.

##  Documentación adicional

* [Compilación](docs/build.md)