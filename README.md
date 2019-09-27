# # Lambda and Gateway Services in AWS

## Code
After create all of instances in AWS...

 - Role
 - Lambda Function
 - Gateway

proceed to modify our Spark Application where instead of manage our result page as a new HTML response after submit the data, this one manage an URL sending it the value param and returning the call to the gateway in AWS.

![enter image description here](https://lh3.googleusercontent.com/mR3vD4N9vI1xnJXk-Ekj-M2zo_VBdhUR9bqdjw7IIzfygfexYSeUnnn5B0SghvEYAZhR5qq-z79N "Fragment Code of Spark App")

## Connection with EC2 Virtual Machine
Accessing to the EC2 console, we have to put the .jar archive with its dependencies, due to without these ones the execution into this will not be possible. In the next image will be presented the correct connection and the function running into, just to proceed to connect through its URL.

![enter image description here](https://lh3.googleusercontent.com/yw8Md28ujZ2sIWEFHQZfxxSgHtwGNCdkn6EYqZTC2mLnLWN5hOP_-8uxZ_MNEexRGkWjQIhNvo5P) 

## Test
Into the URL provided by the EC2 virtual machine, we have this results.

 - Main HTML

 ![enter image description here](https://lh3.googleusercontent.com/PS27pt2pAQyqZucxvCA-iMvYm8kZbJ3CEY1Kug86MaKsxjD5oS_kwMYnxPlQNazl7KonIwzG7tSx)

 - Some tests
 ![enter image description here](https://lh3.googleusercontent.com/o2XeXyXAKvKZrPxJhr3r6fOuKQqQK26H6LkyXN2rz03heDy3DPZulirnuw-PncRix0XISCfAaYOC)
 ![enter image description here](https://lh3.googleusercontent.com/-a3-bwP2yXEJ9VhpYV5H_Zexz_-kwJml9tki901a0MMRADweN2chpgmJW6gSZIv3xJqvy9Ngb5lF)
 ![enter image description here](https://lh3.googleusercontent.com/Rnwck79R8MBVb2XbmpdZX0F-W2kvvVHhvltebJ1mNIHPyfl_c9L_dgTOvNV952i4xhgThprx1kot)
 
## Built with
[Maven](https://maven.apache.org/) - Dependency Management

 ## Author
Sergio Hernando Ruiz Paez - [GitHub](https://github.com/Sergyo97) - Escuela Colombiana de Ingeniería Julio Garavito

## License
This project is under GNU General Public License - see  [LICENSE](https://github.com/Sergyo97/LambdaGatewayServices/blob/master/LICENSE) to more info.
