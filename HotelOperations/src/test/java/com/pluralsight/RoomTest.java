package com.pluralsight;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RoomTest {

    @Test
    void checkInWhenRoomIsAvailable() {
        // Arrange
        Room room = new Room(2, 100.0);
        // Act
        room.checkIn();
        // Assert
        assertTrue(room.isOccupied(), "Room should be occupied after check-in.");
        assertFalse(room.isDirty(), "Room should not be dirty after check-in.");
    }

    @Test
    void checkInWhenRoomIsOccupied() {
        // Arrange
        Room room = new Room(2, 100.0);
        room.checkIn();
        // Act
        room.checkIn();
        // Assert
        assertTrue(room.isOccupied(), "Room should remain occupied.");
    }

    @Test
    void checkInWhenRoomIsDirty() {
        // Arrange
        Room room = new Room(2, 100.0);
        room.checkIn();
        room.checkOut(); // Mark room as dirty
        assertTrue(room.isDirty(), "Room should be dirty after check-out.");
        // Act
        room.checkIn();
        // Assert
        assertFalse(room.isOccupied(), "Room should not be occupied if it is dirty.");
    }

    @Test
    void checkOut() {
        // Arrange
        Room room = new Room(2, 100.0);
        room.checkIn();
        // Act
        room.checkOut();
        // Assert
        assertFalse(room.isOccupied(), "Room should not be occupied after check-out.");
        assertTrue(room.isDirty(), "Room should be marked as dirty after check-out.");
    }

    @Test
    void cleanRoomWhenDirty() {
        // Arrange
        Room room = new Room(2, 100.0);
        room.checkIn();
        room.checkOut(); // Mark room as dirty
        // Act
        room.cleanRoom();
        // Assert
        assertFalse(room.isDirty(), "Room should not be dirty after cleaning.");
    }
}