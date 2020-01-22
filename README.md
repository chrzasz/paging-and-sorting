# Spring Booot RESTful API

### Paging And Sorting Repository

## REST entry point

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

## Repository - findAll

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

## Repository findById

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

## Paging And Sorting

`http://localhost:8080/users?page=1&size=2`

```$xslt
{
  "_embedded" : {
    "users" : [ {
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
    }, {
      "name" : "user3",
      "email" : "u3@u.u",
      "_links" : {
        "self" : {
          "href" : "http://localhost:8080/users/4"
        },
        "appUser" : {
          "href" : "http://localhost:8080/users/4"
        }
      }
    } ]
  },
  "_links" : {
    "first" : {
      "href" : "http://localhost:8080/users?page=0&size=2"
    },
    "prev" : {
      "href" : "http://localhost:8080/users?page=0&size=2"
    },
    "self" : {
      "href" : "http://localhost:8080/users{&sort}",
      "templated" : true
    },
    "next" : {
      "href" : "http://localhost:8080/users?page=2&size=2"
    },
    "last" : {
      "href" : "http://localhost:8080/users?page=6&size=2"
    },
    "profile" : {
      "href" : "http://localhost:8080/profile/users"
    }
  },
  "page" : {
    "size" : 2,
    "totalElements" : 14,
    "totalPages" : 7,
    "number" : 1
  }
}
```

## Repository - FindByEmail

`GET http://localhost:8080/users/search/findByEmail?email=a@a.a`

```$xslt
{
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
}
```