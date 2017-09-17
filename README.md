# imooc_goddess
this is a project on [imooc.com](http://www.imooc.com/learn/157),the code is write by myself,not is down for internet.

# file structure

## dao
data persistence layer，Responsible for calling the business logic layer

## model
physical layer
define entity classes，generate objects for use by data persistence layer

## db
util class,maybe util is more suitable this name than db

## action
business logic layer,This layer can't be，I need to optimize here

## view
view layer,show page

**note**：better structure is vo:physical layer, dao:data persistence layer, service:business logic layer, action:view layer
