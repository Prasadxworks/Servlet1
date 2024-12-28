package com.xworkz.spotify.app.dao;

import com.xworkz.spotify.app.dto.SpotifyDto;
import com.xworkz.spotify.app.util.EntityManagerFactoryUtil;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Query;
import java.util.List;

public class SpotifyDaoImpl implements SpotifyDao{

    public boolean addsonglist(SpotifyDto spotifyDto) {
        EntityManagerFactory entityManagerFactory= EntityManagerFactoryUtil.getEntityManagetFactory();
        EntityManager entityManager=entityManagerFactory.createEntityManager();
        entityManager.getTransaction().begin();
        entityManager.persist(spotifyDto);
        return true;
    }

    public SpotifyDto getUserBySongName(String songName) {

        EntityManagerFactory entityManagerFactory= EntityManagerFactoryUtil.getEntityManagetFactory();
        EntityManager entityManager = entityManagerFactory.createEntityManager();
       Query query= entityManager.createQuery("select user from spotifyDto user where user.songName=:hg");
       query.setParameter("hg",songName);
       SpotifyDto spotifyDto= (SpotifyDto) query.getSingleResult();
       entityManager.close();
        System.out.println("get song names ended");

       return spotifyDto;
    }

    @Override
    public SpotifyDto getSongById(int id) {
        EntityManagerFactory entityManagerFactory = EntityManagerFactoryUtil.getEntityManagetFactory();
        EntityManager entityManager = entityManagerFactory.createEntityManager();
        entityManager.getTransaction().begin();
        SpotifyDto spotifyDto= entityManager.find(SpotifyDto.class,id);
        entityManager.getTransaction().commit();
        entityManager.close();

        return spotifyDto;
    }

    public List<SpotifyDto> getAllSongs() {
        System.out.println("get all names started");
        EntityManagerFactory entityManagerFactory = EntityManagerFactoryUtil.getEntityManagetFactory();

        EntityManager entityManager = entityManagerFactory.createEntityManager();
        Query query = entityManager.createQuery("select alias from SpotifyDto alias");
        List<SpotifyDto> dtos= query.getResultList();
        System.out.println("get all names ended");
        return dtos;
    }

    @Override
    public boolean deleteSongById(int songId) {
        EntityManagerFactory entityManagerFactory = EntityManagerFactoryUtil.getEntityManagetFactory();
        EntityManager entityManager = entityManagerFactory.createEntityManager();
        entityManager.getTransaction().begin();
        Query query=entityManager.createQuery("delete from SpotifyDto where songId=:ref");

        query.setParameter("ref",songId);
        int noOfRows = query.executeUpdate();
        entityManager.getTransaction().commit();
        if(noOfRows>0)
            return true;

        return false;
    }

    @Override
    public void upDateSpotify(SpotifyDto spotifyDto) {
        EntityManagerFactory entityManagerFactory= EntityManagerFactoryUtil.getEntityManagetFactory();
        EntityManager entityManager= entityManagerFactory.createEntityManager();
        entityManager.getTransaction().begin();
        System.out.println(spotifyDto);
        entityManager.merge(spotifyDto);
        entityManager.getTransaction().commit();
        entityManager.close();



    }


}
