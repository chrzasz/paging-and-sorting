# Spring Booot RESTful API

### Paging And Sorting Repository

`GET http://localhost:8080/`  


```
{
  "_links" : {
    "users" : {
      "href" : "http://localhost:8080/users{?page,size,sort}",
      "templated" : true
    },
    "profile" : {
      "href" : "http://localhost:8080/profile"
    }
  }
}
```

`GET http://localhost:8080/users`

```
{
  "_embedded" : {
    "users" : [ {
      "name" : "admin",
      "email" : "a@a.a",
      "_links" : {
        "self" : {
          "href" : "http://localhost:8080/users/1"
        },
        "appUser" : {
          "href" : "http://localhost:8080/users/1"
        }
      }
    }, {
      "name" : "user1",
      "email" : "u1@u.u",
      "_links" : {
        "self" : {
          "href" : "http://localhost:8080/users/2"
        },
        "appUser" : {
          "href" : "http://localhost:8080/users/2"
        }
      }
    }, {
      "name" : "user2",
      "email" : "u2@u.u",
      "_links" : {
        "self" : {
          "href" : "http://localhost:8080/users/3"
        },
        "appUser" : {
          "href" : "http://localhost:8080/users/3"
        }
      }
    }, 
...
}
```

`GET http://localhost:8080/users/8`

```
{
  "name" : "user7",
  "email" : "u7@u.u",
  "_links" : {
    "self" : {
      "href" : "http://localhost:8080/users/8"
    },
    "appUser" : {
      "href" : "http://localhost:8080/users/8"
    }
  }
}
```