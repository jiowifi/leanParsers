import java.util.ArrayList;

class RootModel {

	public String schedule_published_on;
	public String location_name;
	public String description;
	public CopyrightModel _copyright;
	public String end_time;
	public String name;
	public String privacy;
	public String code_of_conduct;
	public String email;
	public int id;
	public String background_image;
	public VersionModel _version;
	public ArrayList<Social_linksModel> social_links;
	public String type;
	public String timezone;
	public String state;
	public String organizer_name;
	public String start_time;
	public CreatorModel _creator;
	public Call_for_papersModel _call_for_papers;
	public String topic;
	public String logo;
	public String organizer_description;

	public RootModel(String schedule_published_on, String location_name, String description, CopyrightModel copyright, String end_time, String name, String privacy, String code_of_conduct, String email, int id, String background_image, VersionModel version, ArrayList<Social_linksModel> social_links, String type, String timezone, String state, String organizer_name, String start_time, CreatorModel creator, Call_for_papersModel call_for_papers, String topic, String logo, String organizer_description) {

		this.schedule_published_on = schedule_published_on;
		this.location_name = location_name;
		this.description = description;
		this._copyright = copyright;
		this.end_time = end_time;
		this.name = name;
		this.privacy = privacy;
		this.code_of_conduct = code_of_conduct;
		this.email = email;
		this.id = id;
		this.background_image = background_image;
		this._version = version;
		this.social_links = social_links;
		this.type = type;
		this.timezone = timezone;
		this.state = state;
		this.organizer_name = organizer_name;
		this.start_time = start_time;
		this._creator = creator;
		this._call_for_papers = call_for_papers;
		this.topic = topic;
		this.logo = logo;
		this.organizer_description = organizer_description;

	}

}