# APM-Demo-EurusBank

This fake bank application is used to showcase several APM scenarios involving web services. 
It is not a stable application, and should not be used in production.

It is made of the following modules:

- **EurusBankWebFrontend**: Very simple web portal.
- **EurusBankMobileFrontend**: Very simple mobile web portal (In development).
- **EurusBankQueryAccountsWS**: Main web service querying all branch to get the balance of one user.
- **EurusBankQueryCaimanIslandsWS**: Web service from Caiman Islands branch.
- **EurusBankQueryAndorraWS**: Web service from Andorra branch. (In development).
- ...

It is built to be distributed in the following application servers (in the same machine):
- **Tomcat8** (listening on port 9088): **EurusBankWebFrontend**, **EurusBankQueryCaimanIslandsWS**
- **Tomcat7** (listening on port 9087): **EurusBankQueryAccountsWS**
- **Tomcat6** (listening on port 9086): -

Several WS technologies are used between modules:

|*(Client)*| *(Server)*|
| ------------- |:-------------|
|EurusBankWebFrontend (*Axis*)|EurusBankQueryAccountsWS (*Axis2*)|
|EurusBankQueryAccountsWS (*JAX-WS*)|EurusBankQueryCaimanIslandsWS (*JAX-WS*)|

Note: This is a work in progress. Everything can change without any notice.
