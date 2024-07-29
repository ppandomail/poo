# Archivos

## Funciones

* Administración del Sistema de Archivos (clase File)
* Persistencia de datos (Buffering): guardar información más allá del tiempo de ejecución de un programa

## Administración del Sistema de Archivos

=== "java"

  ```java
  File f1 = new File("tmp/prueba.txt");
  File f2 = new File("tmp", "prueba.txt");
  File f3 = new File(new File("tmp"), "prueba.txt");
  f1.getName();
  f1.getPath();
  f1.getParent();
  f1.exists();
  f1.canWrite();
  f1.canRead();
  f1.isFile();
  f1.isDirectory();
  f1.isHidden();
  f1.length();
  f1.lastModified();
  f1.mkdir();
  f1.delete();
  f1.renameTo(new File("prueba2.txt"));
  f1.createNewFile();
  f1.list();                             // devuelve String[]
  f1.listFiles();                        // devuelve File[]
  f1.list(FilenameFilter);               // devuelve String[]
  f1.listFiles(FilenameFilter);          // devuelve File[]
  ```

=== "python"

  ```py
  import os

  os.rename(ruta1, ruta2)
  os.remove(ruta)
  os.path.isfile('./proy/PY')  # True si es un archivo
  for f in os.listdir('.'):    # Lista de archivos y directorios
    print(f.title())

  os.mkdir(ruta)  # crea nuevo directorio
  os.chdir(ruta)  # cambia directorio actual por ruta
  os.getcwd()     # devuelve ruta directorio actual
  os.rmdir(ruta)  # borra directorio de la ruta, siempre y cuando esté vacio
  ```

## Persistencia de datos

* Flujo de ENTRADA: abstracción que consume información
* Flujo de SALIDA: abstracción que produce información
* Operaciones de Flujo:
    1. Apertura del Flujo
    1. Lectura/Escritura en el flujo
    1. Cierre del Flujo

    ![Flujos](img/flujos.png)

=== "java"

  ```java
  // escritura
  BufferedWriter bw = new BufferedWriter(new FileWriter("prueba.txt"));
  bw.write("hola");
  bw.newLine();

  // lectura
  BufferedReader br = new BufferedReader(new FileReader("prueba.txt"));
  while((linea = br.readLine()) != null)
    System.out.println(linea);
  ```

=== "python"

  ```py
  from io import open

  # Si el archivo no existe, el método open lo crea
  # 'w': escritura -> reemplaza
  # 'a': append    -> agrega
  fw = open('archivo.txt', 'w')    
  fw.write('Hola mundo \n cruel')
  fw.close()

  # 'r': lectura
  fr = open('archivo.txt', 'r')
  texto = fr.read()           # devuelve todo el contenido del archivo
  lines = fr.readLines()      # devuelve lista de lineas
  print(texto)
  print(lines[0])
  fr.seek(0)                  # se cambia posición del puntero añ caracter en posición 0
  fr.read(11)                 # lee hasta el caracter en posición 11
  fr.close()

  # 'r+': lectura/escritura
  f = open('archivo.txt', 'r+')
  f.write('Comienzo del texto')
  lista = f.readlines()
  lista[1] = 'linea incluida desde el exterior \n'
  f.seek(0)
  f.writelines(lista)
  f.close()
  ```
