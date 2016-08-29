import java.util.ArrayList;

class RootModel {

	public String name;
	public String timezone;
	public String description;
	public String logo;
	public String organizer_description;
	public String schedule_published_on;
	public int id;
	public String state;
	public String organizer_name;
	public String background_image;
	public String end_time;
	public ArrayList<Social_linksModel> social_links;
	public String location_name;
	public CreatorModel _creator;
	public VersionModel _version;
	public String start_time;
	public String privacy;
	public CopyrightModel _copyright;
	public Call_for_papersModel _call_for_papers;
	public String topic;
	public String email;
	public String code_of_conduct;
	public String type;

	public RootModel(String name, String timezone, String description, String logo, String organizer_description, String schedule_published_on, int id, String state, String organizer_name, String background_image, String end_time, ArrayList<Social_linksModel> social_links, String location_name, CreatorModel creator, VersionModel version, String start_time, String privacy, CopyrightModel copyright, Call_for_papersModel call_for_papers, String topic, String email, String code_of_conduct, String type) {

		this.name = name;
		this.timezone = timezone;
		this.description = description;
		this.logo = logo;
		this.organizer_description = organizer_description;
		this.schedule_published_on = schedule_published_on;
		this.id = id;
		this.state = state;
		this.organizer_name = organizer_name;
		this.background_image = background_image;
		this.end_time = end_time;
		this.social_links = social_links;
		this.location_name = location_name;
		this._creator = creator;
		this._version = version;
		this.start_time = start_time;
		this.privacy = privacy;
		this._copyright = copyright;
		this._call_for_papers = call_for_papers;
		this.topic = topic;
		this.email = email;
		this.code_of_conduct = code_of_conduct;
		this.type = type;

	}

}