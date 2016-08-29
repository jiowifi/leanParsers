import java.util.ArrayList;

class RootModel {

	public String code_of_conduct;
	public String end_time;
	public VersionModel _version;
	public String state;
	public CopyrightModel _copyright;
	public ArrayList<Social_linksModel> social_links;
	public String timezone;
	public String topic;
	public int id;
	public String type;
	public String start_time;
	public String schedule_published_on;
	public String email;
	public String location_name;
	public String name;
	public Call_for_papersModel _call_for_papers;
	public String logo;
	public String background_image;
	public String privacy;
	public String organizer_description;
	public String organizer_name;
	public String description;
	public CreatorModel _creator;

	public RootModel(String code_of_conduct, String end_time, VersionModel version, String state, CopyrightModel copyright, ArrayList<Social_linksModel> social_links, String timezone, String topic, int id, String type, String start_time, String schedule_published_on, String email, String location_name, String name, Call_for_papersModel call_for_papers, String logo, String background_image, String privacy, String organizer_description, String organizer_name, String description, CreatorModel creator) {

		this.code_of_conduct = code_of_conduct;
		this.end_time = end_time;
		this._version = version;
		this.state = state;
		this._copyright = copyright;
		this.social_links = social_links;
		this.timezone = timezone;
		this.topic = topic;
		this.id = id;
		this.type = type;
		this.start_time = start_time;
		this.schedule_published_on = schedule_published_on;
		this.email = email;
		this.location_name = location_name;
		this.name = name;
		this._call_for_papers = call_for_papers;
		this.logo = logo;
		this.background_image = background_image;
		this.privacy = privacy;
		this.organizer_description = organizer_description;
		this.organizer_name = organizer_name;
		this.description = description;
		this._creator = creator;

	}

}