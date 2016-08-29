import java.util.ArrayList;

class RootModel {

	public ArrayList<Social_linksModel> social_links;
	public String schedule_published_on;
	public String email;
	public String topic;
	public String description;
	public String logo;
	public String organizer_description;
	public String organizer_name;
	public String end_time;
	public CopyrightModel _copyright;
	public String background_image;
	public String privacy;
	public String type;
	public String state;
	public String code_of_conduct;
	public String name;
	public String location_name;
	public Call_for_papersModel _call_for_papers;
	public CreatorModel _creator;
	public String timezone;
	public VersionModel _version;
	public String start_time;
	public int id;

	public RootModel(ArrayList<Social_linksModel> social_links, String schedule_published_on, String email, String topic, String description, String logo, String organizer_description, String organizer_name, String end_time, CopyrightModel copyright, String background_image, String privacy, String type, String state, String code_of_conduct, String name, String location_name, Call_for_papersModel call_for_papers, CreatorModel creator, String timezone, VersionModel version, String start_time, int id) {

		this.social_links = social_links;
		this.schedule_published_on = schedule_published_on;
		this.email = email;
		this.topic = topic;
		this.description = description;
		this.logo = logo;
		this.organizer_description = organizer_description;
		this.organizer_name = organizer_name;
		this.end_time = end_time;
		this._copyright = copyright;
		this.background_image = background_image;
		this.privacy = privacy;
		this.type = type;
		this.state = state;
		this.code_of_conduct = code_of_conduct;
		this.name = name;
		this.location_name = location_name;
		this._call_for_papers = call_for_papers;
		this._creator = creator;
		this.timezone = timezone;
		this._version = version;
		this.start_time = start_time;
		this.id = id;

	}

}