# Network client
TIME: 631/20 = 31.55
## URLReader
this programm needs to recieve an argument, this should be of type URL: "https://www.google.com" and the result will be saved in resultado.html, you can open resultado.html in your browser
to run pls

    java -cp networkClient-1.0-SNAPSHOT.jar edu.escuelaing.edu.co.URLReader http://www.google.com

## URLScanner

this program allows to get the protocol, authority, host, port, path, query, file and ref of an specific site url
to run pls

    java -cp networkClient-1.0-SNAPSHOT.jar edu.escuelaing.edu.co.URLScanner


## HttpServer
> to run please run main of bttoServer package
this excercise creates an unique instance of http with a singleton pattern, starts a server in port 35000 and have a socket to listen
every string sended from the url search bar, is allowed to difference between method and path, then for the response is allowed to shearch in the www forlder to render the content invoked in there.

    you can invoke http://localhost:35000/mypage.html to see a beauty image of the universe

this server also is boostraped, you can see the styles in action in:

    http://localhost:35000/album/index.html

to run pls

    java -cp networkClient-1.0-SNAPSHOT.jar edu.escuelaing.edu.co.httpServer.HttpServer


## socket
this program have to different classes, first one is the EchoClient and the other EchoServer, to get in, you must run first the EchoServer and ther the EchoClient, you can send messages from the client and will be recievend and replied with the same message from the server

    ex: input: holas
    output: holas
to run pls

    java -cp networkClient-1.0-SNAPSHOT.jar edu.escuelaing.edu.co.soket.EchoServer
    java -cp networkClient-1.0-SNAPSHOT.jar edu.escuelaing.edu.co.soket.EchoClient

## socketcuadrado
this program will have the same communication from the socket server, but the difference, the client will send a number, will be recieved by the server and will be returned with squared of this number

    ex: input: 2
    output: 4.0

to run pls

    java -cp networkClient-1.0-SNAPSHOT.jar edu.escuelaing.edu.co.socketcuadrado.EchoServer
    java -cp networkClient-1.0-SNAPSHOT.jar edu.escuelaing.edu.co.socketcuadrado.EchoClient

## tangente
this program will have the same communication from the socket server, but the difference, the server will receive a number and respond with an operation on this number. This server may receive a message starting with "fun:".
"fun:", if it receives this message it changes the operation to the specified ones.

    ex: input: fun:sin
    expected: change server operations to sin (no output message)
     ex: input: fun:cos
    expected: change server operations to cos (no output message)
     ex: input: fun:tan
    expected: change server operations to tan (no output message)

The server
must answer the sine, cosine and tangent functions. By default it should start
calculating the cosine. For example, if the first number it receives is 0, it should answer 1.
1, if it then receives π/2 it should respond 0, if it then receives "fun:sin" it should change the current operation to sine, cosine and tangent.
it must change the current operation to sine, i.e. from then on it must calculate sines.
must calculate sines. If it then receives 0, it must answer 0.
after you put fun:cos you can put (please put the PI simbol if you will use it)

    ex: input:  fun:cos
     ex: input:  0 
    output: 0.0   (:D)

to run pls

    java -cp networkClient-1.0-SNAPSHOT.jar edu.escuelaing.edu.co.tangente.EchoServer
    java -cp networkClient-1.0-SNAPSHOT.jar edu.escuelaing.edu.co.tangente.EchoClient



## datagrans
this program works wit datagrams,each class have a thread, the DatagramTimeServer works to get the current hour and  it will returnit in a datagramSocket to the client every second, tread of this server is per secont BUT, the DatagramTimeClient will be listen every 5 seconds waiting for that response and will show the current hour, if the server is down, the client can keep showing every 5 seconds the last hour client side could get.
all the prins will be in console.

    output every 5 seconds 
    Date: Thu Jun 10 19:18:27 COT 2021  (current date)

    java -cp networkClient-1.0-SNAPSHOT.jar edu.escuelaing.edu.co.datagrams.DatagramTimeServer
    java -cp networkClient-1.0-SNAPSHOT.jar edu.escuelaing.edu.co.datagrams.DatagramTimeClient



10/June/2021


## License

MIT

**Nicolás Torres Páez**
**colombia school of engineering Julio Garavito**

