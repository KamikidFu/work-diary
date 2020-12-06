# Work-diary MVP branch

## How to get started?
There are two main code repos in this branch, `app\work-diary` is the front-end React app and `server` is the Java Spring boot server. Try `git clone` to pull code to your local.

### Front-end app
Front-end app is boostrapped with [Create React App](https://github.com/facebook/create-react-app), so at least you will need these:
* [Node.js](https://nodejs.org/)
* Your prefer code editor/IDE

Run these commands
* `npm start`

  This will help you to run the app in the development mode at [http://localhost:3000](http://localhost:3000) (if port 3000 is not busy)
* `npm  test`

  Lanch test runner in the interactive watch mode
* `npm run build`

  Build the app for production to the `build` folder

### Back-end server
Back-end server uses [Java Spring Boot](https://spring.io/projects/spring-boot) with [GraphQL](https://graphql.org/) to build/provide APIs.
* Java 8
* maven
* Your prefer code editor/IDE
* Your prefer API test tools

### Database
We use MySQL 5.x as default database, there is a Script folder for any schema/table/view/migration purposes. As at 6 Dec 2020, these is no database CI running behind.
