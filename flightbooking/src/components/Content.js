import React from 'react';
import Table from 'react-bootstrap/Table';
import { ButtonToolbar } from 'react-bootstrap';
import Button from 'react-bootstrap/Button'

//http:localhost:8080/api/vols
const Content = ({ vols }) => {
    console.log(vols)
    return (

        <Table striped bordered hover variant="dark" position="center">

            <thead>
                <tr>
                    <th>N° Vol</th>
                    <th>Avion</th>
                    <th>Date et Heure Départ</th>
                    <th>Date et Heure Arrivé</th>
                    <th>Nombre de places restants</th>
                    <th>Status</th>
                    <th>Reservation</th>

                </tr>
            </thead>
            <tbody>
                {(vols.length > 0) ? vols.map((vols, index) => {
                    console.log(vols.id);

                    return (
                        <tr key={index}>
                            <td>{vols.id}</td>
                            <td>{vols.avion.type}</td>
                            <td>{vols.depart}</td>
                            <td>{vols.arrive}</td>
                            <td>{Math.abs(vols.nb_Place_Reserve - vols.avion.nb_places)}</td>
                            <td>{vols.avion.status === true ? vols.status = "disponible" : vols.status = "indisponible"}</td>
                            <td><ButtonToolbar>
                                <Button variant="outline-info">Book your ticket</Button>
                                </ButtonToolbar>
                            </td>

                        </tr>
                    )
                }) : <tr><td colSpan="7">Loading ...</td></tr>
                }

            </tbody>
        </Table>


    )
}



export default Content;
