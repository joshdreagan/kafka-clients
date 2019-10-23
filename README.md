# Kafka Clients

## Producer

__Plain text__

```
mvn spring-boot:run '-Dkafka.destination.name=my-topic' '-Dcamel.component.kafka.configuration.brokers=localhost:9092'
```

__SSL__

```
mvn spring-boot:run '-Dkafka.destination.name=my-topic' '-Dcamel.component.kafka.configuration.brokers=localhost:9093' '-Dcamel.component.kafka.configuration.security-protocol=SSL' '-Dcamel.component.kafka.use-global-ssl-context-parameters=true' '-Djavax.net.ssl.trustStore=/home/user1/kafka-clients/client.ts' '-Djavax.net.ssl.trustStorePassword=password'
```

## Consumer

__Plain text__

```
mvn spring-boot:run '-Dkafka.destination.name=my-topic' '-Dcamel.component.kafka.configuration.brokers=localhost:9092'
```

__SSL__

```
mvn spring-boot:run '-Dkafka.destination.name=my-topic' '-Dcamel.component.kafka.configuration.brokers=localhost:9093' '-Dcamel.component.kafka.configuration.security-protocol=SSL' '-Dcamel.component.kafka.use-global-ssl-context-parameters=true' '-Djavax.net.ssl.trustStore=/home/user1/kafka-clients/client.ts' '-Djavax.net.ssl.trustStorePassword=password'
```

