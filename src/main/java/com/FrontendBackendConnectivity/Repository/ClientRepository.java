package com.FrontendBackendConnectivity.Repository;





import org.springframework.stereotype.Repository;

import com.FrontendBackendConnectivity.Entity.Client;

import org.springframework.data.jpa.repository.JpaRepository;
@Repository
public interface ClientRepository extends JpaRepository<Client,Integer> {

}
