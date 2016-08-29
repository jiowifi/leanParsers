import java.util.ArrayList;

class RootModel {

	public String background_image;
	public String end_time;
	public String schedule_published_on;
	public String topic;
	public ArrayList<Social_linksModel> social_links;
	public String start_time;
	public String organizer_name;
	public String timezone;
	public String logo;
	public String privacy;
	public CopyrightModel _copyright;
	public String name;
	public Call_for_papersModel _call_for_papers;
	public String organizer_description;
	public int id;
	public String description;
	public String type;
	public String state;
	public String email;
	public String code_of_conduct;
	public String location_name;
	public CreatorModel _creator;
	public VersionModel _version;

	public RootModel(String background_image, String end_time, String schedule_published_on, String topic, ArrayList<Social_linksModel> social_links, String start_time, String organizer_name, String timezone, String logo, String privacy, CopyrightModel copyright, String name, Call_for_papersModel call_for_papers, String organizer_description, int id, String description, String type, String state, String email, String code_of_conduct, String location_name, CreatorModel creator, VersionModel version) {

		this.background_image = background_image;
		this.end_time = end_time;
		this.schedule_published_on = schedule_published_on;
		this.topic = topic;
		this.social_links = social_links;
		this.start_time = start_time;
		this.organizer_name = organizer_name;
		this.timezone = timezone;
		this.logo = logo;
		this.privacy = privacy;
		this._copyright = copyright;
		this.name = name;
		this._call_for_papers = call_for_papers;
		this.organizer_description = organizer_description;
		this.id = id;
		this.description = description;
		this.type = type;
		this.state = state;
		this.email = email;
		this.code_of_conduct = code_of_conduct;
		this.location_name = location_name;
		this._creator = creator;
		this._version = version;

	}

}