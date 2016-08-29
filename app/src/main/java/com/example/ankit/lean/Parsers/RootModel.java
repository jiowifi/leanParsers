import java.util.ArrayList;

class RootModel {

	public VersionModel _version;
	public String location_name;
	public CreatorModel _creator;
	public CopyrightModel _copyright;
	public String email;
	public String type;
	public String start_time;
	public String schedule_published_on;
	public String background_image;
	public String logo;
	public String organizer_description;
	public int id;
	public String organizer_name;
	public Call_for_papersModel _call_for_papers;
	public ArrayList<Social_linksModel> social_links;
	public String name;
	public String description;
	public String state;
	public String end_time;
	public String privacy;
	public String topic;
	public String code_of_conduct;
	public String timezone;

	public RootModel(VersionModel version, String location_name, CreatorModel creator, CopyrightModel copyright, String email, String type, String start_time, String schedule_published_on, String background_image, String logo, String organizer_description, int id, String organizer_name, Call_for_papersModel call_for_papers, ArrayList<Social_linksModel> social_links, String name, String description, String state, String end_time, String privacy, String topic, String code_of_conduct, String timezone) {

		this._version = version;
		this.location_name = location_name;
		this._creator = creator;
		this._copyright = copyright;
		this.email = email;
		this.type = type;
		this.start_time = start_time;
		this.schedule_published_on = schedule_published_on;
		this.background_image = background_image;
		this.logo = logo;
		this.organizer_description = organizer_description;
		this.id = id;
		this.organizer_name = organizer_name;
		this._call_for_papers = call_for_papers;
		this.social_links = social_links;
		this.name = name;
		this.description = description;
		this.state = state;
		this.end_time = end_time;
		this.privacy = privacy;
		this.topic = topic;
		this.code_of_conduct = code_of_conduct;
		this.timezone = timezone;

	}

}