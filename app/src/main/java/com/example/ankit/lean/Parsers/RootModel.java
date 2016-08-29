import java.util.ArrayList;

class RootModel {

	public String logo;
	public String start_time;
	public String end_time;
	public String topic;
	public String location_name;
	public CreatorModel _creator;
	public String code_of_conduct;
	public String organizer_description;
	public int id;
	public String name;
	public Call_for_papersModel _call_for_papers;
	public ArrayList<Social_linksModel> social_links;
	public String email;
	public CopyrightModel _copyright;
	public String organizer_name;
	public String background_image;
	public String privacy;
	public String schedule_published_on;
	public String description;
	public String state;
	public String timezone;
	public VersionModel _version;
	public String type;

	public RootModel(String logo, String start_time, String end_time, String topic, String location_name, CreatorModel creator, String code_of_conduct, String organizer_description, int id, String name, Call_for_papersModel call_for_papers, ArrayList<Social_linksModel> social_links, String email, CopyrightModel copyright, String organizer_name, String background_image, String privacy, String schedule_published_on, String description, String state, String timezone, VersionModel version, String type) {

		this.logo = logo;
		this.start_time = start_time;
		this.end_time = end_time;
		this.topic = topic;
		this.location_name = location_name;
		this._creator = creator;
		this.code_of_conduct = code_of_conduct;
		this.organizer_description = organizer_description;
		this.id = id;
		this.name = name;
		this._call_for_papers = call_for_papers;
		this.social_links = social_links;
		this.email = email;
		this._copyright = copyright;
		this.organizer_name = organizer_name;
		this.background_image = background_image;
		this.privacy = privacy;
		this.schedule_published_on = schedule_published_on;
		this.description = description;
		this.state = state;
		this.timezone = timezone;
		this._version = version;
		this.type = type;

	}

}