const Users = require('./auth.controller');
module.exports = (router) => {
  router.post('/signin', Users.createUser);
  router.post('/login', Users.loginUser);
}
