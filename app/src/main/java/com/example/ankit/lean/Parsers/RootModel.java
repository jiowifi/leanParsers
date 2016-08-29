import java.util.ArrayList;

class RootModel {

	public ArrayList<Social_linksModel> social_links;
	public String type;
	public VersionModel _version;
	public String location_name;
	public String organizer_name;
	public String email;
	public String name;
	public String description;
	public String organizer_description;
	public String background_image;
	public String privacy;
	public String state;
	public String topic;
	public CreatorModel _creator;
	public String code_of_conduct;
	public String start_time;
	public int id;
	public Call_for_papersModel _call_for_papers;
	public String end_time;
	public String timezone;
	public String logo;
	public CopyrightModel _copyright;
	public String schedule_published_on;

	public RootModel(ArrayList<Social_linksModel> social_links, String type, VersionModel version, String location_name, String organizer_name, String email, String name, String description, String organizer_description, String background_image, String privacy, String state, String topic, CreatorModel creator, String code_of_conduct, String start_time, int id, Call_for_papersModel call_for_papers, String end_time, String timezone, String logo, CopyrightModel copyright, String schedule_published_on) {

		this.social_links = social_links;
		this.type = type;
		this._version = version;
		this.location_name = location_name;
		this.organizer_name = organizer_name;
		this.email = email;
		this.name = name;
		this.description = description;
		this.organizer_description = organizer_description;
		this.background_image = background_image;
		this.privacy = privacy;
		this.state = state;
		this.topic = topic;
		this._creator = creator;
		this.code_of_conduct = code_of_conduct;
		this.start_time = start_time;
		this.id = id;
		this._call_for_papers = call_for_papers;
		this.end_time = end_time;
		this.timezone = timezone;
		this.logo = logo;
		this._copyright = copyright;
		this.schedule_published_on = schedule_published_on;

	}

}