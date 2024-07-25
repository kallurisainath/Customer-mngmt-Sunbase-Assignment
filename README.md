# Customer-mngmt-Sunbase-Assignment
This project involves performing CRUD operations on customer table which will be fetched from sunbase database using api endpoints.
<pre>
CustomerManagementSystem/
│
├── src/
│   ├── main/
│   │   ├── java/
│   │   │   └── com/
│   │   │       └── cms/
│   │   │           ├── controller/
│   │   │           │   └── (controller classes)
│   │   │           ├── dao/
│   │   │           │   └── (DAO interfaces)
│   │   │           ├── daoImpl/
│   │   │           │   └── (DAO implementation classes)
│   │   │           ├── model/
│   │   │           │   └── (model classes)
│   │   │           └── util/
│   │   │               └── (utility classes)
│   │   ├── resources/
│   │   │   └── (configuration files, property files, etc.)
│   │   ├── webapp/
│   │       ├── WEB-INF/
│   │       │   ├── lib/
│   │       │   │   └── mysql-connector-java-x.x.x.jar
│   │       │   ├── classes/
│   │       │   └── web.xml
│   │       ├── index.html
│   │       └── (other HTML, CSS, JS files)


How it works:
1.Whenever we start executing the project it will first open index.js which is login page.
2.If the entered login details are correct then it will be moving to customerlist.jsp servlet which is in webapp package.
3.The login credentials are checked in login servlet using sunbaseutility class.
4.The customerList.jsp contains all the project requirements like AddCustomer, Sync, Login, Logout, Search, Table for displaying customers...
5.If we press logout button then controller will be going to logout servlet
6.For addcustomer button createCustomer.jsp will be called
7.Searching and all search related operations are carried out by searchservlet
8.EditCustomer.jsp is used to get particular details of customer and provides us to edit
</pre>





