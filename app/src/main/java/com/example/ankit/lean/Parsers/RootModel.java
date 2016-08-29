import java.util.ArrayList;

class RootModel {

	public String location_name;
	public String organizer_description;
	public String type;
	public String end_time;
	public String state;
	public VersionModel _version;
	public String description;
	public String organizer_name;
	public String timezone;
	public CreatorModel _creator;
	public String name;
	public int id;
	public String privacy;
	public Call_for_papersModel _call_for_papers;
	public String background_image;
	public String code_of_conduct;
	public String topic;
	public String email;
	public String start_time;
	public ArrayList<Social_linksModel> social_links;
	public CopyrightModel _copyright;
	public String schedule_published_on;
	public String logo;

	public RootModel(String location_name, String organizer_description, String type, String end_time, String state, VersionModel version, String description, String organizer_name, String timezone, CreatorModel creator, String name, int id, String privacy, Call_for_papersModel call_for_papers, String background_image, String code_of_conduct, String topic, String email, String start_time, ArrayList<Social_linksModel> social_links, CopyrightModel copyright, String schedule_published_on, String logo) {

		this.location_name = location_name;
		this.organizer_description = organizer_description;
		this.type = type;
		this.end_time = end_time;
		this.state = state;
		this._version = version;
		this.description = description;
		this.organizer_name = organizer_name;
		this.timezone = timezone;
		this._creator = creator;
		this.name = name;
		this.id = id;
		this.privacy = privacy;
		this._call_for_papers = call_for_papers;
		this.background_image = background_image;
		this.code_of_conduct = code_of_conduct;
		this.topic = topic;
		this.email = email;
		this.start_time = start_time;
		this.social_links = social_links;
		this._copyright = copyright;
		this.schedule_published_on = schedule_published_on;
		this.logo = logo;

	}

}