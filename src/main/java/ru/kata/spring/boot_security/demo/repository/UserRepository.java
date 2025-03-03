package ru.kata.spring.boot_security.demo.repository;

import org.springframework.data.domain.Example;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.repository.query.FluentQuery;
import org.springframework.stereotype.Service;
import ru.kata.spring.boot_security.demo.models.MyUser;

import java.util.List;
import java.util.Optional;
import java.util.function.Function;

@Service
public class UserRepository implements IUserRepository{

    @Override
    public <S extends MyUser> S save(S entity) {
        return this.save(entity);
    }




    @Override
    public Optional<MyUser> findByName(String name) {
        return Optional.empty();
    }

    @Override
    public void flush() {

    }

    @Override
    public <S extends MyUser> S saveAndFlush(S entity) {
        return null;
    }

    @Override
    public <S extends MyUser> List<S> saveAllAndFlush(Iterable<S> entities) {
        return List.of();
    }

    @Override
    public void deleteAllInBatch(Iterable<MyUser> entities) {

    }

    @Override
    public void deleteAllByIdInBatch(Iterable<Long> longs) {

    }

    @Override
    public void deleteAllInBatch() {

    }

    @Override
    public MyUser getOne(Long aLong) {
        return null;
    }

    @Override
    public MyUser getById(Long aLong) {
        return null;
    }

    @Override
    public MyUser getReferenceById(Long aLong) {
        return null;
    }

    @Override
    public <S extends MyUser> Optional<S> findOne(Example<S> example) {
        return Optional.empty();
    }

    @Override
    public <S extends MyUser> List<S> findAll(Example<S> example) {
        return List.of();
    }

    @Override
    public <S extends MyUser> List<S> findAll(Example<S> example, Sort sort) {
        return List.of();
    }

    @Override
    public <S extends MyUser> Page<S> findAll(Example<S> example, Pageable pageable) {
        return null;
    }

    @Override
    public <S extends MyUser> long count(Example<S> example) {
        return 0;
    }

    @Override
    public <S extends MyUser> boolean exists(Example<S> example) {
        return false;
    }

    @Override
    public <S extends MyUser, R> R findBy(Example<S> example, Function<FluentQuery.FetchableFluentQuery<S>, R> queryFunction) {
        return null;
    }



    @Override
    public <S extends MyUser> List<S> saveAll(Iterable<S> entities) {
        return List.of();
    }

    @Override
    public Optional<MyUser> findById(Long aLong) {
        return Optional.empty();
    }

    @Override
    public boolean existsById(Long aLong) {
        return false;
    }

    @Override
    public List<MyUser> findAll() {
        return List.of();
    }

    @Override
    public List<MyUser> findAllById(Iterable<Long> longs) {
        return List.of();
    }

    @Override
    public long count() {
        return 0;
    }

    @Override
    public void deleteById(Long aLong) {

    }

    @Override
    public void delete(MyUser entity) {

    }

    @Override
    public void deleteAllById(Iterable<? extends Long> longs) {

    }

    @Override
    public void deleteAll(Iterable<? extends MyUser> entities) {

    }

    @Override
    public void deleteAll() {

    }

    @Override
    public List<MyUser> findAll(Sort sort) {
        return List.of();
    }

    @Override
    public Page<MyUser> findAll(Pageable pageable) {
        return null;
    }
}
