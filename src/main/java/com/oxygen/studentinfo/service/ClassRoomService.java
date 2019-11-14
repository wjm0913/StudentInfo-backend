package com.oxygen.studentinfo.service;

import com.oxygen.studentinfo.entity.ClassRoom;

import java.util.List;

public interface ClassRoomService {
    public boolean addClassRoom(ClassRoom classroom);
    public boolean deleteClassRoomByID(int id);
    public boolean deleteClassRoomByName(String name);
    public boolean deleteClassRoomByGrade(String grade);
    public boolean updateClassRoomNameByID(ClassRoom classRoom);
    public List<ClassRoom> findAll();
    public ClassRoom findById(int id);
}