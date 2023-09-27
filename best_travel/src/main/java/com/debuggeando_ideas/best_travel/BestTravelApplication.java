package com.debuggeando_ideas.best_travel;

import com.debuggeando_ideas.best_travel.repositories.*;
import jakarta.transaction.Transactional;
import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.UUID;


@SpringBootApplication
@Slf4j
public class BestTravelApplication  implements CommandLineRunner{


	private final HotelRepository hotelRepository;

	private final FlyRepository flyRepository;

	private final CustomerRepository customerRepository;

	private final ReservationRepository reservationRepository;

	private final TicketRepository ticketRepository;

	private final TourRepository tourRepository;

	/**
	 * Constructor injection for all repositories
	 * @param hotelRepository
	 * @param flyRepository
	 * @param customerRepository
	 * @param reservationRepository
	 * @param ticketRepository
	 * @param tourRepository
	 */
	public BestTravelApplication(
			HotelRepository hotelRepository,
			FlyRepository flyRepository,
			CustomerRepository customerRepository,
			ReservationRepository reservationRepository,
			TicketRepository ticketRepository,
			TourRepository tourRepository) {
		this.hotelRepository = hotelRepository;
		this.flyRepository = flyRepository;
		this.customerRepository = customerRepository;
		this.reservationRepository = reservationRepository;
		this.ticketRepository = ticketRepository;
		this.tourRepository = tourRepository;
	}


	public static void main(String[] args) {
		SpringApplication.run(BestTravelApplication.class, args);
	}

	/**
	 * This method is used to test the repositories
	 *
	 * @transactional is used to avoid the LazyInitializationException from TicketRepository and ReservationRepository
	 * @param args
	 * @throws Exception
	 */
	@Override
	//@Transactional
	public void run(String... args) throws Exception {
		var hotel = hotelRepository.findById(15L).get();
		var fly = flyRepository.findById(7L).get();
		var ticket = ticketRepository.findById(UUID.fromString("22345678-1234-5678-3235-567812345678")).get();
		var reservation = reservationRepository.findById(UUID.fromString("12345678-1234-5678-1234-567812345678")).get();
		var customer = customerRepository.findById("GOTW771012HMRGR087").get();

		log.info(String.valueOf(fly));
		log.info(String.valueOf(hotel));// se soluciona con @Transactional
		log.info(String.valueOf(ticket));// se soluciona con @Transactional
		log.info(String.valueOf(reservation));
		log.info(String.valueOf(customer));
	}

}