import java.util.ArrayList;

class RootModel {

	public String state;
	public String email;
	public String start_time;
	public CreatorModel _creator;
	public String type;
	public String timezone;
	public String name;
	public String organizer_description;
	public String end_time;
	public int id;
	public String privacy;
	public String background_image;
	public String logo;
	public String code_of_conduct;
	public Call_for_papersModel _call_for_papers;
	public String topic;
	public String schedule_published_on;
	public String location_name;
	public CopyrightModel _copyright;
	public String organizer_name;
	public ArrayList<Social_linksModel> social_links;
	public String description;
	public VersionModel _version;

	public RootModel(String state, String email, String start_time, CreatorModel creator, String type, String timezone, String name, String organizer_description, String end_time, int id, String privacy, String background_image, String logo, String code_of_conduct, Call_for_papersModel call_for_papers, String topic, String schedule_published_on, String location_name, CopyrightModel copyright, String organizer_name, ArrayList<Social_linksModel> social_links, String description, VersionModel version) {

		this.state = state;
		this.email = email;
		this.start_time = start_time;
		this._creator = creator;
		this.type = type;
		this.timezone = timezone;
		this.name = name;
		this.organizer_description = organizer_description;
		this.end_time = end_time;
		this.id = id;
		this.privacy = privacy;
		this.background_image = background_image;
		this.logo = logo;
		this.code_of_conduct = code_of_conduct;
		this._call_for_papers = call_for_papers;
		this.topic = topic;
		this.schedule_published_on = schedule_published_on;
		this.location_name = location_name;
		this._copyright = copyright;
		this.organizer_name = organizer_name;
		this.social_links = social_links;
		this.description = description;
		this._version = version;

	}

}