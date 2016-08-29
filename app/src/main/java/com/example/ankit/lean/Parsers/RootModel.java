import java.util.ArrayList;

class RootModel {

	public Call_for_papersModel _call_for_papers;
	public String end_time;
	public String background_image;
	public CopyrightModel _copyright;
	public CreatorModel _creator;
	public String code_of_conduct;
	public String type;
	public String topic;
	public String description;
	public String start_time;
	public String organizer_name;
	public String location_name;
	public String state;
	public String email;
	public String privacy;
	public ArrayList<Social_linksModel> social_links;
	public String schedule_published_on;
	public String organizer_description;
	public VersionModel _version;
	public String name;
	public String timezone;
	public int id;
	public String logo;

	public RootModel(Call_for_papersModel call_for_papers, String end_time, String background_image, CopyrightModel copyright, CreatorModel creator, String code_of_conduct, String type, String topic, String description, String start_time, String organizer_name, String location_name, String state, String email, String privacy, ArrayList<Social_linksModel> social_links, String schedule_published_on, String organizer_description, VersionModel version, String name, String timezone, int id, String logo) {

		this._call_for_papers = call_for_papers;
		this.end_time = end_time;
		this.background_image = background_image;
		this._copyright = copyright;
		this._creator = creator;
		this.code_of_conduct = code_of_conduct;
		this.type = type;
		this.topic = topic;
		this.description = description;
		this.start_time = start_time;
		this.organizer_name = organizer_name;
		this.location_name = location_name;
		this.state = state;
		this.email = email;
		this.privacy = privacy;
		this.social_links = social_links;
		this.schedule_published_on = schedule_published_on;
		this.organizer_description = organizer_description;
		this._version = version;
		this.name = name;
		this.timezone = timezone;
		this.id = id;
		this.logo = logo;

	}

}