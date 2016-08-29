import java.util.ArrayList;

class RootModel {

	public String topic;
	public String code_of_conduct;
	public String organizer_name;
	public String state;
	public String schedule_published_on;
	public VersionModel _version;
	public CreatorModel _creator;
	public Call_for_papersModel _call_for_papers;
	public String background_image;
	public String end_time;
	public ArrayList<Social_linksModel> social_links;
	public String name;
	public String start_time;
	public String organizer_description;
	public CopyrightModel _copyright;
	public String type;
	public String email;
	public String location_name;
	public String timezone;
	public int id;
	public String privacy;
	public String logo;
	public String description;

	public RootModel(String topic, String code_of_conduct, String organizer_name, String state, String schedule_published_on, VersionModel version, CreatorModel creator, Call_for_papersModel call_for_papers, String background_image, String end_time, ArrayList<Social_linksModel> social_links, String name, String start_time, String organizer_description, CopyrightModel copyright, String type, String email, String location_name, String timezone, int id, String privacy, String logo, String description) {

		this.topic = topic;
		this.code_of_conduct = code_of_conduct;
		this.organizer_name = organizer_name;
		this.state = state;
		this.schedule_published_on = schedule_published_on;
		this._version = version;
		this._creator = creator;
		this._call_for_papers = call_for_papers;
		this.background_image = background_image;
		this.end_time = end_time;
		this.social_links = social_links;
		this.name = name;
		this.start_time = start_time;
		this.organizer_description = organizer_description;
		this._copyright = copyright;
		this.type = type;
		this.email = email;
		this.location_name = location_name;
		this.timezone = timezone;
		this.id = id;
		this.privacy = privacy;
		this.logo = logo;
		this.description = description;

	}

}