import java.util.ArrayList;

class RootModel {

	public String topic;
	public String state;
	public int id;
	public String organizer_name;
	public String timezone;
	public String description;
	public String location_name;
	public String privacy;
	public String organizer_description;
	public String email;
	public Call_for_papersModel _call_for_papers;
	public CreatorModel _creator;
	public String name;
	public String schedule_published_on;
	public ArrayList<Social_linksModel> social_links;
	public String code_of_conduct;
	public String end_time;
	public String logo;
	public String start_time;
	public CopyrightModel _copyright;
	public VersionModel _version;
	public String background_image;
	public String type;

	public RootModel(String topic, String state, int id, String organizer_name, String timezone, String description, String location_name, String privacy, String organizer_description, String email, Call_for_papersModel call_for_papers, CreatorModel creator, String name, String schedule_published_on, ArrayList<Social_linksModel> social_links, String code_of_conduct, String end_time, String logo, String start_time, CopyrightModel copyright, VersionModel version, String background_image, String type) {

		this.topic = topic;
		this.state = state;
		this.id = id;
		this.organizer_name = organizer_name;
		this.timezone = timezone;
		this.description = description;
		this.location_name = location_name;
		this.privacy = privacy;
		this.organizer_description = organizer_description;
		this.email = email;
		this._call_for_papers = call_for_papers;
		this._creator = creator;
		this.name = name;
		this.schedule_published_on = schedule_published_on;
		this.social_links = social_links;
		this.code_of_conduct = code_of_conduct;
		this.end_time = end_time;
		this.logo = logo;
		this.start_time = start_time;
		this._copyright = copyright;
		this._version = version;
		this.background_image = background_image;
		this.type = type;

	}

}