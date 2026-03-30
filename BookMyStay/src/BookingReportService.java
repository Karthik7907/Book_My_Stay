class BookingReportService {
    public void generateReport(BookingHistory history) {
        System.out.println("Booking History Report");
        for (Reservation res : history.getHistory()) {
            System.out.println("Guest: " + res.getGuestName() + ", Room Type: " + res.getRoomType());
        }
    }
}