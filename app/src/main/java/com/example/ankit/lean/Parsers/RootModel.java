import java.util.ArrayList;

class RootModel {

	public ArrayList<Social_linksModel> social_links;
	public String privacy;
	public String schedule_published_on;
	public String timezone;
	public String description;
	public String topic;
	public String location_name;
	public String email;
	public String code_of_conduct;
	public Call_for_papersModel _call_for_papers;
	public VersionModel _version;
	public String logo;
	public String end_time;
	public CopyrightModel _copyright;
	public String background_image;
	public String start_time;
	public String type;
	public String organizer_name;
	public String name;
	public int id;
	public CreatorModel _creator;
	public String state;
	public String organizer_description;

	public RootModel(ArrayList<Social_linksModel> social_links, String privacy, String schedule_published_on, String timezone, String description, String topic, String location_name, String email, String code_of_conduct, Call_for_papersModel call_for_papers, VersionModel version, String logo, String end_time, CopyrightModel copyright, String background_image, String start_time, String type, String organizer_name, String name, int id, CreatorModel creator, String state, String organizer_description) {

		this.social_links = social_links;
		this.privacy = privacy;
		this.schedule_published_on = schedule_published_on;
		this.timezone = timezone;
		this.description = description;
		this.topic = topic;
		this.location_name = location_name;
		this.email = email;
		this.code_of_conduct = code_of_conduct;
		this._call_for_papers = call_for_papers;
		this._version = version;
		this.logo = logo;
		this.end_time = end_time;
		this._copyright = copyright;
		this.background_image = background_image;
		this.start_time = start_time;
		this.type = type;
		this.organizer_name = organizer_name;
		this.name = name;
		this.id = id;
		this._creator = creator;
		this.state = state;
		this.organizer_description = organizer_description;

	}

}