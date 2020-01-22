# Spring Booot RESTful API

### Paging And Sorting Repository

`GET http://localhost:8080/`  


```
{
  "_links" : {
    "appUsers" : {
      "href" : "http://localhost:8080/appUsers{?page,size,sort}",
      "templated" : true
    },
    "profile" : {
      "href" : "http://localhost:8080/profile"
    }
  }
}
```

`GET http://localhost:8080/appUsers`

```
{
  "_embedded" : {
    "appUsers" : [ {
      "name" : "admin",
      "email" : "a@a.a",
      "_links" : {
        "self" : {
          "href" : "http://localhost:8080/appUsers/1"
        },
        "appUser" : {
          "href" : "http://localhost:8080/appUsers/1"
        }
      }
    }, {
      "name" : "user",
      "email" : "u@u.u",
      "_links" : {
        "self" : {
          "href" : "http://localhost:8080/appUsers/2"
        },
        "appUser" : {
          "href" : "http://localhost:8080/appUsers/2"
        }
      }
    } ]
  },
  "_links" : {
    "self" : {
      "href" : "http://localhost:8080/appUsers{?page,size,sort}",
      "templated" : true
    },
    "profile" : {
      "href" : "http://localhost:8080/profile/appUsers"
    }
  },
  "page" : {
    "size" : 20,
    "totalElements" : 2,
    "totalPages" : 1,
    "number" : 0
  }
}
```

`GET http://localhost:8080/appUsers/1`

```
{
  "name" : "admin",
  "email" : "a@a.a",
  "_links" : {
    "self" : {
      "href" : "http://localhost:8080/appUsers/1"
    },
    "appUser" : {
      "href" : "http://localhost:8080/appUsers/1"
    }
  }
}
```