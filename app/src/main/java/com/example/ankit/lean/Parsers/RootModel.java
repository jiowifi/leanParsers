import java.util.ArrayList;

class RootModel {

	public String location_name;
	public int id;
	public String state;
	public String email;
	public String timezone;
	public String name;
	public Call_for_papersModel _call_for_papers;
	public String privacy;
	public String organizer_name;
	public String background_image;
	public CreatorModel _creator;
	public String logo;
	public String organizer_description;
	public String code_of_conduct;
	public String type;
	public CopyrightModel _copyright;
	public VersionModel _version;
	public ArrayList<Social_linksModel> social_links;
	public String topic;
	public String description;
	public String end_time;
	public String schedule_published_on;
	public String start_time;

	public RootModel(String location_name, int id, String state, String email, String timezone, String name, Call_for_papersModel call_for_papers, String privacy, String organizer_name, String background_image, CreatorModel creator, String logo, String organizer_description, String code_of_conduct, String type, CopyrightModel copyright, VersionModel version, ArrayList<Social_linksModel> social_links, String topic, String description, String end_time, String schedule_published_on, String start_time) {

		this.location_name = location_name;
		this.id = id;
		this.state = state;
		this.email = email;
		this.timezone = timezone;
		this.name = name;
		this._call_for_papers = call_for_papers;
		this.privacy = privacy;
		this.organizer_name = organizer_name;
		this.background_image = background_image;
		this._creator = creator;
		this.logo = logo;
		this.organizer_description = organizer_description;
		this.code_of_conduct = code_of_conduct;
		this.type = type;
		this._copyright = copyright;
		this._version = version;
		this.social_links = social_links;
		this.topic = topic;
		this.description = description;
		this.end_time = end_time;
		this.schedule_published_on = schedule_published_on;
		this.start_time = start_time;

	}

}