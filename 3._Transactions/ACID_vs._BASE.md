## ACID

**A**tomicity.

Either the transaction is performed in its entirety or it is not performed at all. Must fail if: Constraint violated, data type mismatch, syntax error.

**C**onsistency.

A transaction must transform the database from one consistent state to another consistent state.

**I**solation.

Transactions execute independently of one another.

**D**urability.

The effects of a committed transaction should be permanently recorded and not get lost because of a subsequent failure.


## BASE

**Ba**sic Availability.

Distributed approach so a failure means that another shard is able to take over.

**S**oft State.

Data consistency must be handled by the developer.

**E**ventual Consistency.

### Examples

ACID databases: Relational databases.

BASE databases: Some NoSQL databases such as Cassandra, Redis, DynamoDB, Couchbase.

Hybrid databases: MongoDB (because they implemented support for transactions)