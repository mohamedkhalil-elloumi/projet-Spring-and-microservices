import React, { Component } from 'react';
import Content from './Content';
import NavBar from './NavBar';
import axios from 'axios'

class Home extends Component {

    constructor(props) {
        super(props);

        this.state = {
            vols: []
        };
    }

    componentDidMount = async () => {

        const vols = await axios.get(`http://localhost:9000/api/vols`)
        this.setState ({ vols : vols.data })             

    }
    render() {
        console.log(this.state.vols)
        return (

            <div>
                <NavBar />
                <Content vols={this.state.vols} />

            </div>
        )
    }
}

export default Home;